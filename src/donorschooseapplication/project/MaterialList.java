/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class MaterialList implements Comparator<Material> {
List <Material> materials;

public MaterialList(){
    this.materials = new LinkedList<>();
}
public boolean addMaterials(Material mate){
    return materials.add(mate);
    
}
public boolean removeMaterial(Material mate)throws EmptyArrayException{
    try{
    return materials.remove(mate);
    }catch (NullPointerException e ){
    throw new EmptyArrayException();
    
    }
    }

public void modifyMaterials (Material search,Material newMate){
    int index = materials.indexOf(search);
    if (index >=0){
        materials.set(index,newMate);
    }    
}

public ArrayList<Material> findMemberWithUsername(String reference){
ArrayList<Material> List= new ArrayList<>();   
    ListIterator<Material> it = materials.listIterator();
    
        while (it.hasNext()) {
            Material temp = (Material) it.next();
            if(temp.getReference().equals(reference)){   
               List.add(temp); 
            }                      
        }
        return /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donorschooseapplication.project;

import donorschooseapplication.member.EmptyArrayException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class MaterialList implements Comparator<Material> {
List <Material> materials;

public MaterialList(){
    this.materials = new LinkedList<>();
}
public boolean addMaterials(Material mate){
    return materials.add(mate);
    
}
public boolean removeMaterial(Material mate)throws EmptyArrayException{
    try{
    return materials.remove(mate);
    }catch (NullPointerException e ){
    throw new EmptyArrayException();
    
    }
    }

public void modifyMaterials (Material search,Material newMate){
    int index = materials.indexOf(search);
    if (index >=0){
        materials.set(index,newMate);
    }    
}

public ArrayList<Material> findMemberWithUsername(String reference){
ArrayList<Material> List= new ArrayList<>();   
    ListIterator<Material> it = materials.listIterator();
    
        while (it.hasNext()) {
            Material temp = (Material) it.next();
            if(temp.getReference().equals(reference)){   
               List.add(temp); 
            }                      
        }
        return List;
}
    @Override
    public int compare(Material s1, Material s2) {
        return(s1.getReference().compareToIgnoreCase(s2.getReference()));
    }
    
    public void sort(Comparator comp){        
        Collections.sort(materials, comp);
    }
    
    @Override
    public String toString(){
    String str = "";
    ListIterator<Material> iter = materials.listIterator();
    while(iter.hasNext()){
        Material mate = iter.next();
        str += mate.toString();
    }
    return str;
    }
    public ListIterator<Material> getMaterials(){
        return materials.listIterator();
    }
}

