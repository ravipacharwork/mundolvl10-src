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

public final class w9
extends c9 {
    public final Account \u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
    public final String[] \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;

    public w9(IAccountManagerResponse iAccountManagerResponse, Account account, String[] stringArray) {
        w9 w92 = object;
        Account account2 = account;
        Object object = account2.type;
        String string = account2.name;
        super(iAccountManagerResponse, (String)object, false, true, string, false, false);
        w92.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b = account;
        w92.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6 = stringArray;
    }

    @Override
    public final void \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6() {
        block6: {
            block5: {
                IAccountAuthenticator iAccountAuthenticator;
                try {
                    iAccountAuthenticator = this.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c;
                    if (iAccountAuthenticator == null) break block5;
                }
                catch (Exception exception) {}
                IAccountAuthenticator iAccountAuthenticator2 = iAccountAuthenticator;
                w9 w92 = this;
                w9 w93 = w92;
                iAccountAuthenticator = w92.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
                String[] stringArray = w93.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
                iAccountAuthenticator2.hasFeatures((IAccountAuthenticatorResponse)this, (Account)iAccountAuthenticator, stringArray);
                return;
                break block6;
            }
            return;
        }
        this.onError(1, "remote exception");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onResult(Bundle var1_1) {
        if ((this /* !! */  = this /* !! */ .\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b()) == null) return;
        if (var1_1 != null) ** GOTO lbl-1000
        try {
            this /* !! */ .onError(5, "null bundle");
            return;
        }
        catch (Exception v0) {
            return;
        }
lbl-1000:
        // 1 sources

        {
            v1 = this /* !! */ ;
        }
        {
            v2 = new Bundle();
            this /* !! */  = "booleanResult";
            v2.putBoolean((String)this /* !! */ , var1_1.getBoolean("booleanResult", false));
            v1.onResult(v2);
            return;
        }
    }
}

