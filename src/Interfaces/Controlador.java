/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Pablo Rod
 */
public interface Controlador<Type> {

    public void insert(Type obj);

    public void update(Type obj);

    public void delete(Type obj);

    public void read(Object id);

    public void readAll();
}
