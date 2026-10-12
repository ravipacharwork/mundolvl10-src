package top.bienvenido.date_24323;

import android.os.Parcelable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/s4.class */
public final class s4 extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final d2 f305;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Class f306;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final Object f307;

    public s4(d2 d2Var, Class cls, Parcelable parcelable) {
        this.f305 = d2Var;
        this.f306 = cls;
        this.f307 = parcelable;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            Class cls = this.f306;
            Object obj2 = this.f307;
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                if (cls.isInstance(objArr[i])) {
                    objArr[i] = obj2;
                    break;
                }
            }
        } catch (Exception unused) {
        }
        return this.f305.mo1(obj, method, objArr);
    }
}
