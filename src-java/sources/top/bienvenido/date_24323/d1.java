package top.bienvenido.date_24323;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d1.class */
public final class d1 implements InvocationHandler {

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final c1 f53xaa30c2c7 = new c1();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final n9 f54 = new n9(0);

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Object f55;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final d2 f56;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final Object f57;

    public d1(Object obj, d2 d2Var) {
        this.f56 = d2Var;
        this.f55 = obj;
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        o9 o9Var = new o9(2);
        c1.m96(cls, o9Var);
        this.f57 = Proxy.newProxyInstance(classLoader, (Class[]) o9Var.toArray(i.f159), this);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m118(int[] iArr, d2 d2Var) {
        for (int i : iArr) {
            this.f54.m386(i, d2Var);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws InvocationTargetException {
        try {
            d2 d2Var = (d2) this.f54.m385(method.getName().hashCode());
            d2 d2Var2 = d2Var;
            if (d2Var == null) {
                d2Var2 = this.f56;
            }
            Object obj2 = this.f55;
            if (objArr == null) {
                objArr = i.f160;
            }
            return d2Var2.mo1(obj2, method, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            InvocationTargetException invocationTargetException = e;
            if (cause != null) {
                invocationTargetException = cause;
            }
            throw invocationTargetException;
        }
    }
}
