package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z4.class */
public final class z4 extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Class f433;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final Function2 f434;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final Object f435;

    public z4(Class cls, Function2 function2) {
        String str = b3.f18;
        this.f433 = cls;
        this.f434 = function2;
        this.f435 = str;
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Object objM119 = d2.m119(objArr, this.f433);
            if (objM119 != null) {
                this.f434.invoke(objM119, this.f435);
            }
        } catch (Throwable unused) {
        }
        return super.mo1(obj, method, objArr);
    }

    public z4(Class cls, Function2 function2, String str) {
        this.f433 = cls;
        this.f434 = function2;
        this.f435 = str;
    }
}
