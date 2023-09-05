package pe.edu.upc.aaw.demoproyecto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoproyecto.entities.AccountPay;

@Repository
public interface IAccountPayRepository extends JpaRepository<AccountPay, Integer> {
}
