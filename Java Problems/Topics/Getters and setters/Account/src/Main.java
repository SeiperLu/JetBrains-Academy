class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    long getBalance(){
        return this.balance;
    }

    String getOwnerName(){
        return this.ownerName;
    }

    boolean isLocked(){
        return this.locked;
    }

    void setBalance(long balance){
        this.balance = balance;
    }

    void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    void setLocked(boolean locked){
        this.locked = locked;
    }
}