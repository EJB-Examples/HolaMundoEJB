package beans;

import javax.ejb.Remote;

/* @Remote: Glassfish va a permitir publicar este componente para que el cliente pueda tener acceso a él y lo pueda llamar de manera remota. */
@Remote
public interface HolaMundoEjbRemote {
    public int sumar(int a, int b);
}
