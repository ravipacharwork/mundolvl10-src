/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.IAccountAuthenticator
 *  android.accounts.IAccountAuthenticatorResponse
 *  android.accounts.IAccountManagerResponse
 *  android.os.Bundle
 */
package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import top.bienvenido.date_24323.c9;
import top.bienvenido.date_24323.m3;

public final class v8
extends c9 {
    public final Account \u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;

    public v8(IAccountManagerResponse iAccountManagerResponse, Account account, boolean bl) {
        v8 v82 = object;
        Account account2 = account;
        Object object = account2.type;
        String string = account2.name;
        super(iAccountManagerResponse, (String)object, bl, true, string, false, false);
        v82.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b = account;
    }

    @Override
    public final void \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6() {
        IAccountAuthenticator iAccountAuthenticator = this.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountRemovalAllowed((IAccountAuthenticatorResponse)this, this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b);
            return;
        }
    }

    @Override
    public final void onResult(Bundle bundle) {
        if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
            m3 m32;
            if (bundle.getBoolean("booleanResult")) {
                m32 = m3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
                m32.getClass();
                m3.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403(this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b);
            }
            if ((m32 = this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b()) != null) {
                try {
                    m32.onResult(bundle);
                }
                catch (Exception exception) {}
            }
        }
        super.onResult(bundle);
    }
}

