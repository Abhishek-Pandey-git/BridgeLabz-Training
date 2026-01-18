package com.javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> items;
    
    public Storage(){
        items=new ArrayList<>();
    }
    
    public void addItem(T item){
        items.add(item);
        System.out.println("Added: "+item.getName());
    }
    
    public void removeItem(int index){
        if(index>=0 && index<items.size()){
            T removed=items.remove(index);
            System.out.println("Removed: "+removed.getName());
        }
    }
    
    public List<T> getItems(){
        return items;
    }
    
    public void displayItems(){
        if(items.isEmpty()){
            System.out.println("Storage is empty");
            return;
        }
        for(int i=0;i<items.size();i++){
            System.out.println((i+1)+". "+items.get(i));
        }
    }
}
