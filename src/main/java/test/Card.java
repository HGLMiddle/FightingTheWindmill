package test;

public enum Card
{
    FINAL_BATTLE("FINAL_BATTLE",30,4),
    ON_FIRE("ON_FIRE", 5,1),
    RBITS("RBITS",3,2),
    RAINBOW_CIRCLE("RAINBOW_CIRCLE",5,2);

    public String name;
    private Integer cost;
    private Integer norma;

    private Card(String name,int cost,int norma)
    {
        this.name = name;
        this.cost = cost;
        this.norma = norma;
    }
}
