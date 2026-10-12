package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: top.bienvenido.date_24323.废物来玩举报可以我坐在你妈坟头上等着, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/废物来玩举报可以我坐在你妈坟头上等着.class */
public final class C0046 extends n1 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final C0046 f480 = new C0046();

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final p9 f481;

    static {
        p9 p9Var;
        p9 p9Var2;
        try {
            int[] iArr = new int[20];
            iArr[0] = 52602690;
            iArr[1] = -2062386608;
            iArr[2] = -895673731;
            iArr[3] = -139251669;
            iArr[4] = -244555749;
            iArr[5] = -1726932149;
            iArr[6] = 1903902114;
            iArr[7] = 542441041;
            iArr[8] = -223469635;
            iArr[9] = 434482434;
            iArr[10] = -406040016;
            iArr[11] = 1365911975;
            iArr[12] = 36778333;
            iArr[13] = -5573545;
            iArr[14] = -751646898;
            iArr[15] = 691260818;
            iArr[16] = 710297143;
            iArr[17] = 175802396;
            iArr[18] = 1344438003;
            iArr[19] = 1011607;
            p9Var = p9Var2;
            p9Var2 = new p9(20);
            for (int i = 0; i < 20; i++) {
                p9Var.m423(iArr[i]);
            }
        } catch (Exception unused) {
            p9Var = p9Var;
            p9 p9Var3 = new p9(0);
        }
        f481 = p9Var;
    }

    @Override // top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        try {
            String str = (String) d2.m119(objArr, String.class);
            if (str != null) {
                p9 p9Var = f481;
                if ((a.m2(p9Var.f276, p9Var.f277, str.hashCode()) >= 0 || StringsKt.startsWith$default(str, "com.google.android.", false, 2, (Object) null)) || StringsKt.startsWith$default(str, f4.f92, false, 2, (Object) null)) {
                    String str2 = "Assume application obtained permission -> " + str;
                    return 0;
                }
            }
        } catch (Exception unused) {
        }
        return super.mo1(obj, method, objArr);
    }
}
