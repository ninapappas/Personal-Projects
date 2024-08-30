package Default;

public class BankSheet{
    private static double reqRes; 
    private static double exRes;
    private static double assets; 
    private static double liabilities; 
    private static int resReq; 

  public BankSheet(int req, double a){ // set assets,  required reserves, and excess reserves 
    reqRes = (1/req) * a; 
    assets = a; 
    exRes = assets - reqRes; 
  }
  public static double getAssets(){
    return assets;
  }
  public static double getLiabilities(){
    return liabilities;
  }  
  public static double getReqRes(){
    return reqRes;
  }  
  public static double getExRes(){
    return exRes;
  }  
  public static double getResReq(){
    return resReq;
  } 
  
  public static void setAssets(double as){ 
    assets += as; 
  }
  public static void setReqRes(double rr){
    reqRes += rr;
  }
  public static void setExRes(double er){
    exRes += er;
  }
  public static void setLiabilities(double l){
    liabilities += l;
  }
  
  

 
}
