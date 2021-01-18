import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


class InterseccaoClientes
{
    public ArrayList<String> listaFinal;
    
    public InterseccaoClientes(final ArrayList<String> list, final ArrayList<String> list2) {
        this.listaFinal = new ArrayList<String>();
        for (final String e : list) {
            final Iterator<String> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                if (e == iterator2.next()) {
                    this.listaFinal.add(e);
                    break;
                }
            }
        }
        Collections.sort(this.listaFinal);
    }
}