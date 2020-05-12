public interface Fly {

    void takeOff();

    int ascend(int meters);

    default void glide(){
        System.out.println("It glides into the air.");
    }

    int descend(int meters);

    void land();

}