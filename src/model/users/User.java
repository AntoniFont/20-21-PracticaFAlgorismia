package model.users;
/**
 * Classe que representa un usuari de l'aplicació.
 * 
 * @author Bernat Galmés Rubert
 */
public class User {
    String name;
    String surname1;
    String surname2;
    int id;
    int nPlatfAcces = 0;

    public User(String n, String sn1, String sn2){
        this.name = n;
        this.surname1 = sn1;
        this.surname2 = sn2;
        id = getUsersAmount();
        id++;
    }

    /**
     * Main idea: Get how many users does exist.
     * @return
     */
    private int getUsersAmount(){
        return -1;
    }

}
