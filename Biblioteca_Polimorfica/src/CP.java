package clases_especiales;

/**
 *
 * @author Usuario
 */
public class CP {

    /**
     *
     * @param nif
     * @return
     */
    public boolean comprobarNif(String nif){
		if(nif.length() != 9){
			return false;
		}
		for(int i = 0; i < nif.length(); i++){
			if(i <= 7){
				if(Character.isDigit(nif.charAt(i)) == false){
					return false;
				}
			}else{
				if(Character.isLetter(nif.charAt(i)) == true){
					return true;
				}
			}
		}
		return false;
	}
}
