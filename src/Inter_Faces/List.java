/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Inter_Faces;

/**
 *
 * @author Pablo Rod
 */
public interface List<Type>  {
     public boolean agregar(Type obj);
    public boolean eliminar(Type obj);
    public Type buscar(Object id);
    public boolean actualizar (Type obj);
}
