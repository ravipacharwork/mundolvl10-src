package top.bienvenido.date_24323;

/* JADX INFO: renamed from: top.bienvenido.date_24323.野爹我手持八倍镜sks瞄准你婊子妈那残破不堪的子宫一阵压枪点射瞬间将你婊子的子宫打的千疮百孔血流如注然后野爹再对准你亲妈的子宫点燃一颗冲天炮顷刻间你妈上了天, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/野爹我手持八倍镜sks瞄准你婊子妈那残破不堪的子宫一阵压枪点射瞬间将你婊子的子宫打的千疮百孔血流如注然后野爹再对准你亲妈的子宫点燃一颗冲天炮顷刻间你妈上了天.class */
public final class sks {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f525;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public int[] f526;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public int f527;

    public sks() {
        int[] iArr = i.f158;
        this.f525 = iArr;
        this.f526 = iArr;
        this.f527 = 0;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m684(int i, int i2) {
        int[] iArr = this.f525;
        int[] iArr2 = iArr;
        int i3 = this.f527;
        int iM2 = a.m2(iArr, i3, i);
        if (iM2 >= 0) {
            this.f526[iM2] = i2;
            return;
        }
        int i4 = iM2 ^ (-1);
        int i5 = i3 + 1;
        if (i5 <= iArr2.length) {
            System.arraycopy(iArr2, i4, iArr2, i4 + 1, i3 - i4);
            iArr2[i4] = i;
        } else {
            int[] iArr3 = new int[(i3 | 1) << 1];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            iArr3[i4] = i;
            System.arraycopy(iArr2, i4, iArr3, i4 + 1, iArr2.length - i4);
            iArr2 = iArr3;
        }
        this.f525 = iArr2;
        int[] iArr4 = this.f526;
        int[] iArr5 = iArr4;
        if (i5 <= iArr4.length) {
            System.arraycopy(iArr5, i4, iArr5, i4 + 1, i3 - i4);
            iArr5[i4] = i2;
        } else {
            int[] iArr6 = new int[(i3 | 1) << 1];
            System.arraycopy(iArr5, 0, iArr6, 0, i4);
            iArr6[i4] = i2;
            System.arraycopy(iArr5, i4, iArr6, i4 + 1, iArr5.length - i4);
            iArr5 = iArr6;
        }
        this.f526 = iArr5;
        this.f527 = i5;
    }
}
