package pe.edu.upc.aaw.demoproyecto.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoproyecto.entities.AccountPay;
import pe.edu.upc.aaw.demoproyecto.repositories.IAccountPayRepository;
import pe.edu.upc.aaw.demoproyecto.repositories.ISupportRepository;
import pe.edu.upc.aaw.demoproyecto.serviceinterfaces.IAccountPayService;

import java.util.List;


@Service
public class AccountPayServiceImplement implements IAccountPayService {

    @Autowired
    private IAccountPayRepository apR;
    @Override
    public void insert(AccountPay accountPay) {

    }

    @Override
    public List<AccountPay> list() {
        return null;
    }

    @Override
    public void delete(int idPayAccount) {

    }

    @Override
    public AccountPay listId(int idPayAccount) {
        return null;
    }
}
