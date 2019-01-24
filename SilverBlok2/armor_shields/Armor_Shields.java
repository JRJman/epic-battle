package SilverBlok2.armor_shields;

public class Armor_Shields {

    private int _Defense;
    private int _Durability;
    private int _Weight;

    public void SetDefense(int Defense){
        _Defense = Defense;
    }
    public int GetDefense(){
        return _Defense;
    }

    public void SetDurability(int Durability){
        _Durability = Durability;
    }
    public int GetDurability(){
        return _Durability;
    }

    public void SetWeight(int Weight){
        _Weight = Weight;
    }
    public int GetWeight(){
        return _Weight;
    }
}
