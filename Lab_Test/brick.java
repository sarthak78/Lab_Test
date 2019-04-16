package test;

public class brick {
	public static boolean makeBricks(int small, int big, int goal) {

	    int totalInches = small + big*5;
	    if(totalInches < goal){
	        return false;
	    }

	    int bigInches= big*5;
	    int smallRequired = goal %5;

	    if(smallRequired > small && bigInches != goal){
	        return false;
	    }else if(smallRequired <=small){
	        if( bigInches >= goal || smallRequired + bigInches == goal || small +bigInches ==goal 
	                || small+ bigInches == goal){
	            return true;
	        }if(bigInches + small > goal){
	            if(small > goal-bigInches){
	                return true;
	            }
	        }

	    }
	    return false;
	}
}

