package top.bienvenido.date_24323;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w2.class */
public final class w2 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int f372;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public int f373 = -1;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final /* synthetic */ x2 f374;

    public w2(x2 x2Var) {
        this.f374 = x2Var;
        this.f372 = ((C0025x6efc2d81) x2Var).f463.f470 - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f373 < this.f372;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return ((C0025x6efc2d81) this.f374).f463.f469[this.f373 << 1];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return ((C0025x6efc2d81) this.f374).f463.f469[(this.f373 << 1) + 1];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x2 x2Var = this.f374;
        int i = this.f373;
        C0031x7011f1e3 c0031x7011f1e3 = ((C0025x6efc2d81) x2Var).f463;
        int i2 = (i << 1) | 1;
        Object[] objArr = c0031x7011f1e3.f469;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f373++;
        return this;
    }
}
