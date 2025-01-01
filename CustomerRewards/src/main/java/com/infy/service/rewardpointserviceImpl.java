package com.infy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.infy.model.transaction;

@Service
public class rewardpointserviceImpl implements RewardPointService {
	
	
	static ArrayList<transaction> transaction = new ArrayList<transaction>();

	 public static int calculateRewardPoints(transaction cust) {
	        double amount = cust.getAmount();
	        int points = 0;

	        if (amount > 100) {
	            
	            points += (int) ((amount - 100) * 2);  
	        }
	        if (amount > 50) {
	            
	            points += (int) ((Math.min(amount, 100) - 50) * 1);  
	        }

	        return points;
	    }
	
		public Map<String, Integer> monthlypointswithtotal(int customerId)	{
		
		int OctPts = 0;
	    int NovPts = 0;
	    int DecPts = 0;
	    
	    for (transaction t : transaction) {
	    	
      if (t.getCustomer().getCustomerId() == customerId) {
          int points = rewardpointserviceImpl.calculateRewardPoints(t);
          String month = t.getDate().substring(5, 7);

          switch (month) {
              case "10":
             	 OctPts += points;
                  break;
              case "11":
             	 NovPts += points;
                  break;
              case "12":
             	 DecPts += points;
                  break;
          }
      }
  }
		
		Map<String, Integer> result = new HashMap<>();
		result.put("October", OctPts);
     result.put("November", NovPts);
     result.put("December", DecPts);
     
     result.put("Total", OctPts + NovPts + DecPts);
		
     return result;
	}
	
	
	
	
}
