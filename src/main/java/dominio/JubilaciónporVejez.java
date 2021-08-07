
package dominio;

/**
 *
 * @author Vanessa
 */
public class JubilaciónporVejez extends Jubilado {

public JubilaciónporVejez()
{
super(null, null, 0, 0);
}

 public double CalculoDineroV(double pi, double salarioBase) {
double total = pi + (salarioBase * 0.15);
return total;
}
}
