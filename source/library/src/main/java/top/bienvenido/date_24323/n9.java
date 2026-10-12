package top.bienvenido.date_24323;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n9.class */
public final class n9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f253;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public Object[] f254;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public int f255;

    public n9(int i) {
        if (i == 0) {
            this.f253 = i.f158;
            this.f254 = i.f160;
        } else {
            this.f254 = new Object[i];
            this.f253 = new int[i];
        }
        this.f255 = 0;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object m385(int i) {
        int iM2 = a.m2(this.f253, this.f255, i);
        if (iM2 < 0) {
            return null;
        }
        return this.f254[iM2];
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean m388(int i) {
        int[] iArr = this.f253;
        int i2 = this.f255;
        int iM2 = a.m2(iArr, i2, i);
        if (iM2 < 0) {
            return false;
        }
        if (i2 == 1) {
            this.f255 = 0;
            this.f253 = i.f158;
            this.f254 = i.f160;
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i3 - iM2;
        Object[] objArr = this.f254;
        if (i3 < (objArr.length >> 2)) {
            Object[] objArr2 = new Object[i3];
            int[] iArr2 = new int[i3];
            if (iM2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, iM2);
                System.arraycopy(iArr, 0, iArr2, 0, iM2);
            }
            if (i4 != 0) {
                int i5 = iM2 + 1;
                System.arraycopy(objArr, i5, objArr2, iM2, i4);
                System.arraycopy(iArr, i5, iArr2, iM2, i4);
            }
            this.f254 = objArr2;
            this.f253 = iArr2;
        } else {
            if (i4 != 0) {
                int i6 = iM2 + 1;
                System.arraycopy(objArr, i6, objArr, iM2, i4);
                System.arraycopy(iArr, i6, iArr, iM2, i4);
            }
            objArr[i3] = null;
        }
        this.f255 = i3;
        return true;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m386(int i, Object obj) {
        int[] iArr = this.f253;
        int i2 = this.f255;
        int iM2 = a.m2(iArr, i2, i);
        if (iM2 >= 0) {
            this.f254[iM2] = obj;
            return;
        }
        int i3 = iM2 ^ (-1);
        this.f253 = m9.m315(iArr, i2, i3, i);
        Object[] objArr = this.f254;
        int i4 = i2 + 1;
        if (i4 <= objArr.length) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i2 - i3);
            objArr[i3] = obj;
        } else {
            Object[] objArr2 = new Object[(i2 | 1) << 1];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            objArr2[i3] = obj;
            System.arraycopy(objArr, i3, objArr2, i3 + 1, objArr.length - i3);
            objArr = objArr2;
        }
        this.f254 = objArr;
        this.f255 = i4;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object[] m387() {
        return Arrays.copyOf(this.f254, this.f255);
    }
}
