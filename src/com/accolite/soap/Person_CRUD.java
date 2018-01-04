package com.accolite.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC) 
public interface Person_CRUD {

	public void create_item(int id,String name,String contact);
	public void delete_item(int id);
	public void update_item(int id,String new_name,String new_contact);
	public Person retrieve_item(int id);
	public Person[] display_all();
}
