package server

import javax.xml.bind.DatatypeConverter

import client.AsymmetricEncryptor
import org.scalatest.{FunSuite, Matchers}

class AsymmetricServerSpecs extends FunSuite with Matchers {

  test("given private key, decrypts the bytes") {
    val format = "der"

    new AsymmetricEncryptor("src/main/resources/keypair_" + format.toUpperCase + "/public_key." + format).enc("my data").foreach(hex => {

      new AsymmetricServer("src/main/resources/keypair_" + format.toUpperCase + "/private_key." + format).decrypt(hex).map(s => {

        println(hex)

        s shouldBe "my data"

      })

    })

  }

  test("given private key, decrypts hex") {
    val value1 = "5aae8b0e3db810c13876838452b18cbede9890c665f2fd2ffe2dcccd7ba414687c1a9b531ca359e26c6f4433c54644c7bdbff159e55a5544905fed7598397476fdc4164c424c1505fd7cf5b2d0fc22b6981b2e12b4daf2c55180e4324c3917a1bbbe2d03ac55b801d5f6dcdc4e57ed9404b85082574530dbb80288de837757d0f51d49d74bd31297c75d18f03c43a403f7ffd21e69c556afa6747b02df8bbff6389b5e31ff5eff3eb2d402f8b97eb310391c73212ddb51fa6b1b130a51583d8a33151cf66fd3abc18ed22f5e78b2962cb99b881ee5f63e09096c10d96f95a830cf7f8e96b2efb54f7d7b7955786b3edb0f0678c09a86b67b1ded612ad4ad5be3"
    println(value1.getBytes().length)

    val format = "der"
    new AsymmetricServer("src/main/resources/keypair_" + format.toUpperCase + "/private_key." + format).decrypt(value1).map(s => {
      new String(s) shouldBe "data to encrypt"
    })
  }
}
