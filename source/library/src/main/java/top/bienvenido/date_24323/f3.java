package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/f3.class */
public final class f3 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final /* synthetic */ IAccountManagerResponse f89;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final /* synthetic */ Account f90dj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(IAccountManagerResponse iAccountManagerResponse, Account account, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f89 = iAccountManagerResponse;
        this.f90dj = account;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f49;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountCredentialsForCloning(this, this.f90dj);
        }
    }

    @Override // top.bienvenido.date_24323.c9, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("booleanResult", false)) {
            super.onResult(bundle);
            return;
        }
        Account account = this.f90dj;
        new e3(this.f89, account, bundle, account.type, account.name).m1125();
    }
}
