package SilverBlok2;

import java.util.*;
import SilverBlok2.armor_shields.*;
import SilverBlok2.weapons.*;

public class Player {

    private int _Hp;
    private int _Attack;
    private int _Defence;
    private int _MaxWeight;
    private int _Weight;
    private String _Name;
    private String _Weapons[] = {};
    private Weapon _RealWeapons[] = {};
    private String _Shield;
    private Armor_Shields _RealShield;
    private String _Armor;
    private Armor_Shields _RealArmor;


    public void SetHp(int Hp){
        if(Hp < 0){
            Hp = 0;
        }
        _Hp = Hp;
    }
    public int GetHp(){
        return _Hp;
    }


    public void SetAttack(int Attack){
        _Attack = Attack;
    }
    public int GetAttack(){
        return _Attack;
    }


    public void SetDefence(int Defence){
        _Defence = Defence;
    }
    public int GetDefence(){
        return _Defence;
    }


    public void SetMaxWeight(int MaxWeight){
        _MaxWeight = MaxWeight;
    }
    public int GetMaxWeight(){
        return _MaxWeight;
    }


    public void SetWeight(int Weight){
        _Weight = _Weight + Weight;
    }
    public int GetWeight(){
        return _Weight;
    }


    public void SetName(String Name){
        _Name = Name;
    }
    public String GetName(){
        return _Name;
    }


    public void AddWeapon(String Item){
        _Weapons = Arrays.copyOf(_Weapons, _Weapons.length + 1);
        _RealWeapons = Arrays.copyOf(_RealWeapons, _RealWeapons.length + 1);
        int number = _Weapons.length - 1;
        switch(Item){
            case "Knife":
                _Weapons[number] = "Knife";
                _RealWeapons[number] = new Knife();
                break;
            case "Pistol":
                _Weapons[number] = "Pistol";
                _RealWeapons[number] = new Pistol();
                break;
            case "RPG":
                _Weapons[number] = "RPG";
                _RealWeapons[number] = new RPG();
                break;
            case "Shotgun":
                _Weapons[number] = "Shotgun";
                _RealWeapons[number] = new Shotgun();
                break;
            case "Sword":
                _Weapons[number] = "Sword";
                _RealWeapons[number] = new Sword();
                break;
        }
    }
    public boolean CheckDurabilityWeapon(int WeaponNumber){
        if(_RealWeapons[WeaponNumber].GetDurability() == 0){
            _Weight = _Weight - _RealWeapons[WeaponNumber].GetWeight();

            _RealWeapons[WeaponNumber] = null;
            _Weapons[WeaponNumber] = null;
            return true;
        }
        return false;
    }
    public int GetWeaponsLength(){
       return _Weapons.length;
    }
    public String GetWeapons(int Number){
        return _Weapons[Number];
    }
    public Weapon GetRealWeapon(int Number){
        return _RealWeapons[Number];
    }


    public void SetShield(String Shield){
        _Shield = Shield;
        Shield = Shield.toLowerCase();
        switch(Shield){
            case"wooden_shield":
                _RealShield = new Hout();
                break;
            case"iron_shield":
                _RealShield = new IJzer();
                break;
            case"steel_shield":
                _RealShield = new Staal();
                break;
            case"gold_shield":
                _RealShield = new Goud();
                break;
            case"diamond_shield":
                _RealShield = new Diamond();
                break;
        }
    }
    public void CheckDurabilityShield(){
        if(_RealShield.GetDurability() <= 0){
            _RealShield = null;
        }
    }
    public String GetShield(){
        return _Shield;
    }
    public Armor_Shields GetRealShield(){
        return _RealShield;
    }


    public void SetArmor(String Armor){
        _Armor = Armor;
        Armor = Armor.toLowerCase();
        switch(Armor){
            case"wooden_armor":
                _RealArmor = new Hout();
                break;
            case"iron_armor":
                _RealArmor = new IJzer();
                break;
            case"steel_armor":
                _RealArmor = new Staal();
                break;
            case"gold_armor":
                _RealArmor = new Goud();
                break;
            case"diamond_armor":
                _RealArmor = new Diamond();
                break;
        }
    }
    public void CheckDurabilityArmor(){
        if(_RealArmor.GetDurability() <= 0){
            _RealArmor = null;
        }
    }
    public String GetArmor(){
        return _Armor;
    }
    public Armor_Shields GetRealArmor(){
        return _RealArmor;
    }
}
