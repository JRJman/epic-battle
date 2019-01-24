package SilverBlok2.weapons;

public class Weapon {

    private int _Damage;
    private int _Durability;
    private int _Weight;
    private int _Accuracy;

    public void SetDamage(int Damage){
        _Damage = Damage;
    }
    public int GetDamage(){
        return _Damage;
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

    public void SetAccuracy(int Accuracy){
        _Accuracy = Accuracy;
    }
    public int GetAccuracy(){
        return _Accuracy;
    }
}
