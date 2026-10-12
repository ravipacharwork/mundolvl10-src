package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/i3.class */
public final class i3 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final /* synthetic */ Account f167;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final /* synthetic */ String f168dj;

    /* JADX INFO: renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样, reason: contains not printable characters */
    public final /* synthetic */ Bundle f169x541a43c1;

    /* JADX INFO: renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化, reason: contains not printable characters */
    public final /* synthetic */ boolean f170x4f52efc;

    /* JADX INFO: renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public final /* synthetic */ boolean f171;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(IAccountManagerResponse iAccountManagerResponse, boolean z, Account account, String str, Bundle bundle, boolean z2, boolean z3, String str2, String str3) {
        super(iAccountManagerResponse, str2, z, false, str3, false, false);
        this.f167 = account;
        this.f168dj = str;
        this.f169x541a43c1 = bundle;
        this.f170x4f52efc = z2;
        this.f171 = z3;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        try {
            IAccountAuthenticator iAccountAuthenticator = this.f49;
            if (iAccountAuthenticator != null) {
                iAccountAuthenticator.getAuthToken(this, this.f167, this.f168dj, this.f169x541a43c1);
            }
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.date_24323.c9, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("authtoken");
            if (string != null) {
                String string2 = bundle.getString("authAccount");
                String string3 = bundle.getString("accountType");
                if (string3 == null || string3.length() == 0 || string2 == null || string2.length() == 0) {
                    onError(5, "the type and name should not be empty");
                    return;
                }
                if (!this.f170x4f52efc) {
                    m3.f224.mo36(new Account(string2, string3), this.f168dj, string);
                }
                long j = bundle.getLong("android.accounts.expiry", 0L);
                if (this.f170x4f52efc && j > System.currentTimeMillis()) {
                    m3 m3Var = m3.f224;
                    Account account = this.f167;
                    String str = this.f168dj;
                    m3Var.getClass();
                    if (account != null && str != null) {
                        ba baVar = m3.f225.f199;
                        baVar.getClass();
                        if (System.currentTimeMillis() <= j) {
                            baVar.f31.m584(new x9(account, str), new aa(string, j));
                        }
                    }
                }
            }
            if (((Intent) bundle.getParcelable("intent")) != null && this.f171 && !this.f170x4f52efc) {
                c9.m110(bundle);
            }
        }
        super.onResult(bundle);
    }
}
