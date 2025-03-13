# test_app.py

import unittest
from app import app

class FlaskTestCase(unittest.TestCase):
    def setUp(self):
        app.testing = True
        self.app = app.test_client()

    def test_home(self):
        response = self.app.get('/')
        self.assertEqual(response.status_code, 200)
        self.assertIn(b"Hello, World!", response.data)

if __name__ == '__main__':
    unittest.main()
