package top.bienvenido.date_24323;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/p9.class */
public final class p9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f276;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public int f277;

    public p9(int i) {
        if (i == 0) {
            this.f276 = i.f158;
        } else {
            this.f276 = new int[i];
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m423(int i) {
        int iM2 = a.m2(this.f276, this.f277, i);
        if (iM2 >= 0) {
            return false;
        }
        int i2 = this.f277;
        int[] iArr = this.f276;
        int i3 = iM2 ^ (-1);
        if (i2 + 1 <= iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i2 - i3);
            iArr[i3] = i;
        } else {
            int[] iArr2 = new int[(i2 | 1) << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            iArr2[i3] = i;
            System.arraycopy(iArr, i3, iArr2, i3 + 1, iArr.length - i3);
            iArr = iArr2;
        }
        this.f276 = iArr;
        this.f277 = i2 + 1;
        return true;
    }
}
