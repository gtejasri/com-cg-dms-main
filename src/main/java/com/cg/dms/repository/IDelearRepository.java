package com.cg.dms.repository;

import java.util.List;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Customer;
import com.cg.dms.entities.Dealer;
import com.cg.dms.exception.DealerNotFoundException;

public interface IDelearRepository {

	public Dealer insertDealer(Dealer dealer);

	public Dealer updateDealer(Dealer dealer) throws DealerNotFoundException;

	public Dealer deleteDealer(Dealer dealer) throws DealerNotFoundException;

	public List<Dealer> getDealer(int dealerId);

	public List<Customer> getAllCustomers();
	public List<Customer> getCustomer(int customerId);
	public List<Company> getAllCompanys();
	public Company getCompany(int comapnyId);
}