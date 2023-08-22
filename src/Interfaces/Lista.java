/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Pablo Rod
 */
public interface Lista<Type> {

    public boolean insert(Type obj);

    public boolean update(Type obj);

    public boolean delete(Type obj);

    public Type search(Object id);

    public Type[] toArray();
}
