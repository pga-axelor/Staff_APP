package com.staff.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.staff.service.ActiveStaffDetailsImp;
import com.staff.service.RetireStaffDetailsImp;
import com.staff.service.StaffDetailsService;

public class Appmodule  extends AbstractModule{

	@Override
	protected void configure() {
		bind(StaffDetailsService.class).annotatedWith(Names.named("Active")).to(ActiveStaffDetailsImp.class).asEagerSingleton();
		bind(StaffDetailsService.class).annotatedWith(Names.named("Retire")).to(RetireStaffDetailsImp.class).asEagerSingleton();
		
	}
	

}
