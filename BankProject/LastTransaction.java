/**
* This class keeps record of last type of transaction of the customer
*/
public class LastTransaction {
	public String typeOfTransaction;
	public String lastTypeOfTransaction(){
		return typeOfTransaction;
	}
	
	public void setLastTypeOfTransaction(String type){
		typeOfTransaction = type;
	}
}
