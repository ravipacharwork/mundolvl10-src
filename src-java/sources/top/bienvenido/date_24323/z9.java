package top.bienvenido.date_24323;

import android.util.LruCache;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/z9.class */
public final class z9 extends LruCache {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final C0031x7011f1e3 f445;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final C0031x7011f1e3 f446;

    public z9() {
        super(64000);
        this.f445 = new C0031x7011f1e3(0);
        this.f446 = new C0031x7011f1e3(0);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m584(x9 x9Var, aa aaVar) {
        Pair pair = new Pair(x9Var.f414.type, aaVar.f9);
        y9 y9Var = (y9) this.f445.get(pair);
        y9 y9Var2 = y9Var;
        if (y9Var == null) {
            y9Var2 = y9Var;
            y9 y9Var3 = new y9(this);
        }
        y9Var2.f428.add(x9Var);
        this.f445.put(pair, y9Var2);
        y9 y9Var4 = (y9) this.f446.get(x9Var.f414);
        y9 y9Var5 = y9Var4;
        if (y9Var4 == null) {
            y9Var5 = y9Var;
            y9 y9Var6 = new y9(this);
        }
        y9Var5.f428.add(x9Var);
        this.f446.put(x9Var.f414, y9Var5);
        put(x9Var, aaVar);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((aa) obj2).f9.length();
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        y9 y9Var;
        x9 x9Var = (x9) obj;
        aa aaVar = (aa) obj2;
        aa aaVar2 = (aa) obj3;
        if (aaVar == null || aaVar2 != null || (y9Var = (y9) this.f445.remove(new Pair(x9Var.f414.type, aaVar.f9))) == null) {
            return;
        }
        y9Var.m577();
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m585(String str, String str2) {
        y9 y9Var = (y9) this.f445.get(new Pair(str, str2));
        if (y9Var != null) {
            y9Var.m577();
        }
    }
}
