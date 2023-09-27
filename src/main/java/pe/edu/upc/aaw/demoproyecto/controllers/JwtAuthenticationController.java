package pe.edu.upc.aaw.demoproyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.demoproyecto.security.JwtRequest;
import pe.edu.upc.aaw.demoproyecto.security.JwtResponse;
import pe.edu.upc.aaw.demoproyecto.security.JwtTokenUtil;
import pe.edu.upc.aaw.demoproyecto.serviceimplements.JwtUserDetailsService;


//Clase 3
@RestController
@CrossOrigin
public class JwtAuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private JwtUserDetailsService userDetailsService;
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		authenticate(authenticationRequest.getNameUsuario(), authenticationRequest.getPasswordUsuario());
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getNameUsuario());
		final String token = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new JwtResponse(token));
	}
	private void authenticate(String nameUsuario, String passwordUsuario) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(nameUsuario, passwordUsuario));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}