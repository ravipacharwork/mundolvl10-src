package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/e3.class */
public final class e3 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final /* synthetic */ Account f74;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final /* synthetic */ Bundle f75dj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f74 = account;
        this.f75dj = bundle;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        Iterator it = m3.f225.f197.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((C0068) it.next()).f516, this.f74)) {
                IAccountAuthenticator iAccountAuthenticator = this.f49;
                if (iAccountAuthenticator != null) {
                    iAccountAuthenticator.addAccountFromCredentials(this, this.f74, this.f75dj);
                    return;
                }
                return;
            }
        }
    }
}
