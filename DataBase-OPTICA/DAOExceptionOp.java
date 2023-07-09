public class DAOExceptionOp extends Exception {
  
    public DAOExceptionOp(String message) {
        super(message);
    }
   
    public DAOExceptionOp(String message, Throwable cause) {
        super(message, cause);
    }
    
    @Override
    public String toString() {
        String className = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (className + ": " + message) : className;
    }
}