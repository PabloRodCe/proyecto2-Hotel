/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Inter_Faces;

/**
 *
 * @author Pablo Rod
 */
public interface Controller<Type>  {
    public void agregar(Type obj);
    public void eliminar(Type obj);
    public void buscar(Type obj);
    public void actualizar (Type obj);
    
}
