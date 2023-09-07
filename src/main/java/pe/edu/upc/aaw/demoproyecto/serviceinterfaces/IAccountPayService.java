package pe.edu.upc.aaw.demoproyecto.serviceinterfaces;

import pe.edu.upc.aaw.demoproyecto.entities.AccountPay;


import java.util.List;

public interface IAccountPayService {

    public void insert(AccountPay accountPay);
    public List<AccountPay> list();
    public void delete(int idPayAccount);
    public AccountPay listId(int idPayAccount);
}
