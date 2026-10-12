package top.bienvenido.date_24323;

import android.accounts.Account;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/x9.class */
public final class x9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Account f414;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final String f415;

    public x9(Account account, String str) {
        this.f414 = account;
        this.f415 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return Objects.equals(this.f414, x9Var.f414) && Objects.equals(this.f415, x9Var.f415);
    }

    public final int hashCode() {
        return this.f414.hashCode() ^ this.f415.hashCode();
    }
}
