package top.bienvenido.date_24323;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/g6.class */
public final class g6 extends Authenticator {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ String f119;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ char[] f120;

    public g6(String str, char[] cArr) {
        this.f119 = str;
        this.f120 = cArr;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        return getRequestorType() == Authenticator.RequestorType.PROXY ? new PasswordAuthentication(this.f119, this.f120) : super.getPasswordAuthentication();
    }
}
