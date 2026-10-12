package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/v8.class */
public final class v8 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final Account f366;

    public v8(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
        super(iAccountManagerResponse, account.type, z, true, account.name, false, false);
        this.f366 = account;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f49;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountRemovalAllowed(this, this.f366);
        }
    }

    @Override // top.bienvenido.date_24323.c9, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
            if (bundle.getBoolean("booleanResult")) {
                m3 m3Var = m3.f224;
                Account account = this.f366;
                m3Var.getClass();
                m3.m310(account);
            }
            IAccountManagerResponse iAccountManagerResponseM111 = m111();
            if (iAccountManagerResponseM111 != null) {
                try {
                    iAccountManagerResponseM111.onResult(bundle);
                } catch (Exception unused) {
                }
            }
        }
        super.onResult(bundle);
    }
}
