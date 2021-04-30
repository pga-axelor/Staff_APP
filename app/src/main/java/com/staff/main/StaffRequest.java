package com.staff.main;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.staff.service.StaffDetailsService;

public class StaffRequest {
  StaffDetailsService activeStaffDetailsService;
  StaffDetailsService retireStaffDetailsService;
  
  @Inject
  public StaffRequest(@Named("Active")StaffDetailsService activeImpl,@Named("Retire")StaffDetailsService retireImpl,String req)
  {
	  this.activeStaffDetailsService=activeImpl;
	  this.retireStaffDetailsService=retireImpl;
  }
  public void makerequest(String req)
  {
	  if(req.equals("Staff"))
	  {
		  activeStaffDetailsService.details();
	  }
	  else
	  {
		  retireStaffDetailsService.details();
	  }
  }
  
}
