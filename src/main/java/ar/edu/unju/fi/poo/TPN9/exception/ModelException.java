package ar.edu.unju.fi.poo.TPN9.exception;

public class ModelException extends RuntimeException {
	
	private static final long serialVersionUID = 0;
	
	private Throwable cause;
  
	/**
	* Constructs with an explanatory message.
	* Detail about the reason for the exception.
	*
	* @param message
	*/
	public ModelException(String message) {
		super(message);
	}
  
	/**
	 * Constructs a new Exception with the specified cause.
	 * 
	 * @param cause The cause.
	 */
	public ModelException(Throwable cause) {
		super();
		this.cause = cause;
	}    
  
	/**
	 * Returns the cause of this exception or null if the cause is nonexistent
	 * or unknown.
	 *
	 * @return
	 */
	@Override
	public Throwable getCause() {
		return this.cause;
	}
}