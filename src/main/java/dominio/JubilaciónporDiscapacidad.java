
package dominio;

/**
 *
 * @author Vanessa
 */
public class JubilaciónporDiscapacidad extends Jubilado {

public JubilaciónporDiscapacidad() {
super(null, null, 0, 0);
}

 public double CalculoDineroD(double pi, double salarioBase, double porDiscapacidad) {
 double total = pi + (salarioBase * (porDiscapacidad * 0.01));
 return total;

}
}