package com.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Dao.Taxdao;
import com.product.Entity.Tax;

@Service
public class TaxService {
	@Autowired 
	Taxdao chargedao;

	public void inserttaxes(List<Tax> t) {
		chargedao.inserttaxes(t);
	}

	public void deletechrges(String c) {
		System.out.println(c+"service");
		chargedao.deletechrges(c);
	}

	public List fetch() {
		return chargedao.fetch();
	}

	
	
	

}
