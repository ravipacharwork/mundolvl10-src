package top.bienvenido.date_24323;

import android.content.IClipboardManagerExt;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import system.ext.loader.core.ExtCreator;
import system.ext.loader.core.ExtRegistry;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/u6.class */
public final class u6 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final u6 f355 = new u6();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() throws NoSuchMethodException {
        if (AbstractC0065x6082d607.f507) {
            ExtRegistry.registerExt(IClipboardManagerExt.class, (ExtCreator) Proxy.newProxyInstance(IClipboardManagerExt.class.getClassLoader(), new Class[]{ExtCreator.class}, u6::m514));
            return;
        }
        Object objMo393 = t2.m482("android.content.ClipboardManagerExtPlugin", "constructor").mo393(null);
        Constructor declaredConstructor = y6.class.getDeclaredConstructor(i.f159);
        declaredConstructor.setAccessible(true);
        new p2("ctor").f270.mo394(objMo393, declaredConstructor);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m514(Object obj, Method method, Object[] objArr) {
        return new y6();
    }
}
