public abstract class Actor implements ActorBehavoir {
    public Actor(String name){
        this.name = name;
    }
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

}
