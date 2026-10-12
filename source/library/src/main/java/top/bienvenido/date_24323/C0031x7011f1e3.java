package top.bienvenido.date_24323;

import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你脖子上顶的是肿瘤你一日三餐是犬类排泄物你的长相就是撒旦的吊宁说的每一句话都是母狗发情宁的存在简直就是麦克斯韦方程组的瑕疵宁的母亲就是一只鸡宁的生殖器堪比阿米巴原虫宁的一举一动都像个王八, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你脖子上顶的是肿瘤你一日三餐是犬类排泄物你的长相就是撒旦的吊宁说的每一句话都是母狗发情宁的存在简直就是麦克斯韦方程组的瑕疵宁的母亲就是一只鸡宁的生殖器堪比阿米巴原虫宁的一举一动都像个王八.class */
public final class C0031x7011f1e3 extends AbstractMap {

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public int f470;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final C0025x6efc2d81 f471 = new C0025x6efc2d81(this);

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f468 = i.f158;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public Object[] f469 = i.f160;

    public C0031x7011f1e3(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f468 = i.f158;
        this.f469 = i.f160;
        this.f470 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return a.m2(this.f468, this.f470, obj != null ? obj.hashCode() : 0) >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iM2 = a.m2(this.f468, this.f470, obj != null ? obj.hashCode() : 0);
        if (iM2 >= 0) {
            return this.f469[(iM2 << 1) | 1];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2 = a.m2(this.f468, this.f470, iHashCode);
        if (iM2 >= 0) {
            int i = (iM2 << 1) | 1;
            Object[] objArr = this.f469;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        int i2 = this.f470;
        int[] iArr = this.f468;
        if (i2 >= iArr.length) {
            Object[] objArr2 = this.f469;
            int i3 = i2 | 1;
            int[] iArr2 = new int[i3 << 1];
            this.f468 = iArr2;
            this.f469 = new Object[i3 << 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(objArr2, 0, this.f469, 0, objArr2.length);
        }
        Object[] objArr3 = this.f469;
        int[] iArr3 = this.f468;
        int i4 = iM2 ^ (-1);
        int i5 = i4 << 1;
        if (i4 < i2) {
            int i6 = i4 + 1;
            int i7 = i2 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            System.arraycopy(objArr3, i5, objArr3, i6 << 1, i7 << 1);
        }
        iArr3[i4] = iHashCode;
        objArr3[i5] = obj;
        objArr3[i5 | 1] = obj2;
        this.f470 = i2 + 1;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iM2 = a.m2(this.f468, this.f470, obj != null ? obj.hashCode() : 0);
        if (iM2 < 0) {
            return null;
        }
        Object[] objArr = this.f469;
        int i = iM2 << 1;
        Object obj2 = objArr[i | 1];
        int i2 = this.f470;
        if (i2 <= 1) {
            clear();
            return obj2;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f468;
        if (i3 < (iArr.length >> 2)) {
            int[] iArr2 = new int[i3];
            this.f468 = iArr2;
            this.f469 = new Object[i3 << 1];
            if (iM2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iM2);
                System.arraycopy(objArr, 0, this.f469, 0, i);
            }
            if (iM2 < i3) {
                int i4 = iM2 + 1;
                int i5 = i3 - iM2;
                System.arraycopy(iArr, i4, this.f468, iM2, i5);
                System.arraycopy(objArr, i4 << 1, this.f469, i, i5 << 1);
            }
        } else {
            if (iM2 < i3) {
                int i6 = iM2 + 1;
                int i7 = i3 - iM2;
                System.arraycopy(iArr, i6, iArr, iM2, i7);
                System.arraycopy(objArr, i6 << 1, objArr, i, i7 << 1);
            }
            int i8 = i3 << 1;
            objArr[i8] = null;
            objArr[i8 | 1] = null;
        }
        this.f470 = i3;
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f470;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f471.f401;
    }
}
