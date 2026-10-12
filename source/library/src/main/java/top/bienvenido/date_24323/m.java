package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/m.class */
public final class m extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final String[] f217;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public Account[] f218dj;

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public ArrayList f219x541a43c1;

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public int f220x4f52efc;

    public m(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        super(iAccountManagerResponse, str, false, true, null, false, false);
        this.f217 = strArr;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        Account[] accountArrMo28 = m3.f224.mo28(this.f42);
        this.f219x541a43c1 = new ArrayList(accountArrMo28.length);
        this.f218dj = accountArrMo28;
        this.f220x4f52efc = 0;
        m262x541a43c1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public final void m262x541a43c1() {
        int i = this.f220x4f52efc;
        Account[] accountArr = this.f218dj;
        if (i < accountArr.length) {
            IAccountAuthenticator iAccountAuthenticator = this.f49;
            if (iAccountAuthenticator == null) {
                return;
            }
            try {
                iAccountAuthenticator.hasFeatures(this, accountArr[i], this.f217);
                return;
            } catch (Exception unused) {
                onError(1, "remote exception");
                return;
            }
        }
        IAccountManagerResponse iAccountManagerResponseM111 = m111();
        if (iAccountManagerResponseM111 != null) {
            try {
                int size = this.f219x541a43c1.size();
                Account[] accountArr2 = new Account[size];
                for (int i2 = 0; i2 < size; i2++) {
                    accountArr2[i2] = this.f219x541a43c1.get(i2);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("accounts", accountArr2);
                iAccountManagerResponseM111.onResult(bundle);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.c9, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            onError(5, "null bundle");
            return;
        }
        if (bundle.getBoolean("booleanResult", false)) {
            this.f219x541a43c1.add(this.f218dj[this.f220x4f52efc]);
        }
        this.f220x4f52efc++;
        m262x541a43c1();
    }
}
